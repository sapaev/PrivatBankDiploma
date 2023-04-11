package dto.responseDTO_Diploma;


import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RateDTO {
    String ccy;
    String base_ccy;
    String buy;
    String sale;
}
