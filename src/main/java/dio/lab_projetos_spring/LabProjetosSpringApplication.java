package dio.lab_projetos_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class LabProjetosSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabProjetosSpringApplication.class, args);
	}

}
