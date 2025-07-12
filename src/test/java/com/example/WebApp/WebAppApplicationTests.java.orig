package com.example.WebApp; 
 
import org.junit.jupiter.api.Test; 
import org.springframework.boot.test.context.SpringBootTest; 
 
import static org.hamcrest.Matchers.containsString; 
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get; 
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print; 
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content; 
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status; 
 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc; 
import org.springframework.test.web.servlet.MockMvc; 
 
@SpringBootTest 
@AutoConfigureMockMvc 
class WebAppApplicationTests { 
 
 @Autowired 
 private MockMvc mockMvc; 
 
 @Test 
 public void shouldReturnDefaultMessage() throws Exception { 
  this.mockMvc.perform(get("/")) 
    .andDo(print()).andExpect(status().isOk()) 
    .andExpect(content() 
     .string(containsString("Hello, World!"))); 
 } 
 @Test 
 public void shouldReturnDefaultMessageMadan() throws Exception { 
  this.mockMvc.perform(get("/madan")) 
    .andDo(print()).andExpect(status().isOk()) 
    .andExpect(content() 
     .string(containsString("Hello, Mádan!"))); 
 } 
 @Test 
 public void shouldReturnDefaultMessageNovoEndPoint() throws Exception { 
  this.mockMvc.perform(get("/novoEndPoint")) 
    .andDo(print()).andExpect(status().isOk()) 
    .andExpect(content() 
     .string(containsString("Hello, NovoEndPoint!"))); 
<<<<<<< HEAD
 } 
 @Test 
 public void shouldReturnDefaultMessageNovoEndPointEclipse() throws Exception { 
  this.mockMvc.perform(get("/novoEndPointEclipse")) 
    .andDo(print()).andExpect(status().isOk()) 
    .andExpect(content() 
     .string(containsString("Hello, NovoEndPointEclipse!"))); 
 } 
=======
 }
 @Test
 public void shouldReturnDefaultMessageNovoEndPointIntelliJ() throws Exception {
  this.mockMvc.perform(get("/novoEndPointIntelliJ"))
          .andDo(print()).andExpect(status().isOk())
          .andExpect(content()
                  .string(containsString("Hello, NovoEndPointIntelliJ!")));
 }
>>>>>>> 88b4fcad1058d978be85352da1923fb9acbfc0c7
} 