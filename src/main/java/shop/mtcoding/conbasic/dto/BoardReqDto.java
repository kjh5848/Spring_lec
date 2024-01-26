package shop.mtcoding.conbasic.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BoardReqDto {
    private String title;
    private String content;

}
