package com.abdulwali.subflowsaas_api.payload;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
// Instead of returning a plain list to the frontend,
// we wrap it in this class so we can easily add

public class SubscriptionResponse {

    private List<SubscriptionDTO> content;
}
