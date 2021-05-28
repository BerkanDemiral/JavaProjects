package kodlamaio.northwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2 // swagger'i başlatan anotasyondur. apilerimizi dökümante edilebilir hale getirir. 
public class NorthwindApplication {

	public static void main(String[] args) {
		SpringApplication.run(NorthwindApplication.class, args);
	}
	@Bean // Uygulama başlayıp springBoot bu bean'i gördüğü anda bunu belleğe yerleştiriyor 
		  // ardından bir docket isimli nesne ili bizim controllerilarımızı(apileri) bulup bir dökümantasyon haline getirir. 
	      // daha sonra test yapmak istersek çok işimize yarar  
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("kodlamaio.northwind"))                                     
          .build();                                           
    }

}

// bütün projelerimizde kullanıcıya:
// 1. cevap 2.mesaj(hata veya kabul) vermemiz gerekmekte.
