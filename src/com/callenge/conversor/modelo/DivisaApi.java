package com.callenge.conversor.modelo;

public record DivisaApi(String base_code,
                        String target_code,
                        Double conversion_rate,
                        Double conversion_result,
                        String time_last_update_utc) {
}
