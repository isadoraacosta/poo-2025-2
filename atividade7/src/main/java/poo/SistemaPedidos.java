package poo;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.List;
import java.io.File;
import java.util.ArrayList;


@SpringBootApplication
@RestController
public class SistemaPedidos {

    public static void main(String[] args) {
        SpringApplication.run(SistemaPedidos.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Olá %s!", name);
    }

    @GetMapping("/produtos")
    public List<Produto> listarProdutos() {
        List<Produto> produtos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(getClass().getResourceAsStream("/produtos.csv")))) {

            String linha;
            br.readLine();

            while ((linha = br.readLine()) != null) {
                String[] p = linha.split(",");
                String id = p[0];
                String nome = p[1];
                double preco = Double.parseDouble(p[2].replace("\"", "").trim());
                String descricao = p[3];

                produtos.add(new Produto(id, nome, preco, descricao));
            }

            ObjectMapper mapper = new ObjectMapper();
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File("produtos.json"), produtos);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return produtos;
    }
}









