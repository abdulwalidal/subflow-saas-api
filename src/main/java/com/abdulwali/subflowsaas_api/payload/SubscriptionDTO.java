package com.abdulwali.subflowsaas_api.payload;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
// SubscriptionDTO (Data Transfer Object)
// Controls what data gets exposed to the client (frontend/API response)
// We use this instead of returning the raw Subscription entity directly
// so we can hide sensitive fields and control the API response structure
public class SubscriptionDTO {

    private Long Id;
    private String name;
    private double price;
    private String category;
 //   private LocalDate createdAt;

}
