package ec.com.tio.leo.dev.exma;

import lombok.extern.slf4j.Slf4j;
// import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Arrays;
import java.util.Objects;

@Slf4j
@EnableJpaRepositories
@SpringBootApplication(scanBasePackages = {"ec.com.tio.leo.dev.exma"})
public class ExMaRootApplication {

	public static void main(String[] args) {

		try {
			SpringApplication.run(ExMaRootApplication.class, args);
			log.info("*************************************  INICIO DE SISTEMA  **********************************");
		} catch (Exception exception) {
			if (!Objects.equals(exception.getClass().getName(), "org.springframework.boot.devtools.restart.SilentExitExceptionHandler$SilentExitException") && log.isErrorEnabled()) {
				log.error("*************************************Ha ocurrido una exception**********************************");
				log.error("Exception: " + exception);
				//log.error("Root Cause: " + ExceptionUtils.getRootCause(exception).toString());
			}
		}
	}

	/**
	 * commandLineRunner.
	 *
	 * @param ctx the ctx
	 * @return CommandLineRunner instance
	 */
	@Bean
	public CommandLineRunner commandLineRunner(ListableBeanFactory ctx) {
		if (log.isDebugEnabled()) {
			log.debug("Beans Loaded by Spring Boot: " +
					"@En{}", ctx.getBeanDefinitionCount());
		}
		return args -> {
			if (log.isDebugEnabled()) {
				String[] beanNames = ctx.getBeanDefinitionNames();
				Arrays.sort(beanNames);
				for (String beanName : beanNames) {
					log.debug("Bean: {}", beanName);
				}
			}
		};
	}


}
