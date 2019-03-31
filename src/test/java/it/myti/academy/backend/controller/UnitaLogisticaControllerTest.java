package it.myti.academy.backend.controller;

import it.myti.academy.backend.service.UnitaLogisticaService;
import it.myti.academy.backend.service.impl.UnitaLogisticaServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(UnitaLogisticaController.class)
public class UnitaLogisticaControllerTest {

    @TestConfiguration
    static class EmployeeServiceImplTestContextConfiguration {

        @Bean
        public UnitaLogisticaServiceImpl employeeService() {
            return new UnitaLogisticaServiceImpl();
        }
    }

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getByIdAndUtente() throws Exception {
        final Long id = Long.valueOf(1);
        final MockHttpServletRequestBuilder requestBuilder = get("/unitalogistiche/1").contentType(MediaType.TEXT_PLAIN);
        mockMvc.perform(requestBuilder)
                .andExpect(status().isOk())
                .andExpect(content().string(id.toString()));
    }
}
