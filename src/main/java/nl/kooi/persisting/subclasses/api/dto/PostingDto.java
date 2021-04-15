package nl.kooi.persisting.subclasses.api.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;
import lombok.ToString;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = CarPostingDto.class, name = "CarPosting"),
        @JsonSubTypes.Type(value = MotorCyclePostingDto.class, name = "MotorCyclePosting"),
        @JsonSubTypes.Type(value = PostingDto.class, name = "Posting"),
})
@Data
@ToString
public class PostingDto {
    private String title;
    private String color;
    private String brand;
    private String condition;
}
