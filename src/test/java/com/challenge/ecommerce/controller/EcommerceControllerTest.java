package com.challenge.ecommerce.controller;


import com.challenge.ecommerce.service.PriceService;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource(
        locations = "/application.properties")
class EcommerceControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    PriceService priceService;

    final String BASE_URL = "/ecommerce";

    @Test
    @DisplayName("Getting price for date: 2020-06-14 10:00:00, brand: 1 and product: 35455 with given date and brandId")
    void shouldReturnPriceGivenDateAndBrandIdAndProductIdCaseOne() throws Exception {
        String date = "2020-06-14 10:00:00";
        Long brandId = new Long(1);
        Integer productId = 35455;
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get(BASE_URL + "/price/" + productId + "?apply_date=" + date + "&brand_id=" + brandId)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andReturn();

        String body = result.getResponse().getContentAsString();
        Assert.assertFalse(body.isEmpty());
        Assert.assertEquals(result.getResponse().getStatus(), HttpStatus.OK.value());
    }

    @Test
    @DisplayName("Getting price for date: 2020-06-14 16:00:00, brand: 1 and product: 35455 with given date and brandId")
    void shouldReturnPriceGivenDateAndBrandIdAndProductIdCaseTwo() throws Exception {
        String date = "2020-06-14 16:00:00";
        Long brandId = new Long(1);
        Integer productId = 35455;
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get(BASE_URL + "/price/" + productId + "?apply_date=" + date + "&brand_id=" + brandId)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andReturn();

        String body = result.getResponse().getContentAsString();
        Assert.assertFalse(body.isEmpty());
        Assert.assertEquals(result.getResponse().getStatus(), HttpStatus.OK.value());
    }

    @Test
    @DisplayName("Getting price for date: 2020-06-14 21:00:00, brand: 1 and product: 35455 with given date and brandId")
    void shouldReturnPriceGivenDateAndBrandIdAndProductIdCaseThree() throws Exception {
        String date = "2020-06-14 21:00:00";
        Long brandId = new Long(1);
        Integer productId = 35455;
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get(BASE_URL + "/price/" + productId + "?apply_date=" + date + "&brand_id=" + brandId)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andReturn();

        String body = result.getResponse().getContentAsString();
        Assert.assertFalse(body.isEmpty());
        Assert.assertEquals(result.getResponse().getStatus(), HttpStatus.OK.value());
    }

    @Test
    @DisplayName("Getting price for date: 2020-06-15 10:00:00, brand: 1 and product: 35455 with given date and brandId")
    void shouldReturnPriceGivenDateAndBrandIdAndProductIdCaseFour() throws Exception {
        String date = "2020-06-15 10:00:00";
        Long brandId = new Long(1);
        Integer productId = 35455;
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get(BASE_URL + "/price/" + productId + "?apply_date=" + date + "&brand_id=" + brandId)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andReturn();

        String body = result.getResponse().getContentAsString();
        Assert.assertFalse(body.isEmpty());
        Assert.assertEquals(result.getResponse().getStatus(), HttpStatus.OK.value());
    }

    @Test
    @DisplayName("Getting price for date: 2020-06-16 21:00:00, brand: 1 and product: 35455 with given date and brandId")
    void shouldReturnPriceGivenDateAndBrandIdAndProductIdCaseFive() throws Exception {
        String date = "2020-06-14 16:00:00";
        Long brandId = new Long(1);
        Integer productId = 35455;
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get(BASE_URL + "/price/" + productId + "?apply_date=" + date + "&brand_id=" + brandId)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andReturn();

        String body = result.getResponse().getContentAsString();
        Assert.assertFalse(body.isEmpty());
        Assert.assertEquals(result.getResponse().getStatus(), HttpStatus.OK.value());
    }
}