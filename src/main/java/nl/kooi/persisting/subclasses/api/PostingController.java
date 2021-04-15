package nl.kooi.persisting.subclasses.api;

import lombok.RequiredArgsConstructor;
import nl.kooi.persisting.subclasses.api.dto.CarPostingDto;
import nl.kooi.persisting.subclasses.api.dto.MotorCyclePostingDto;
import nl.kooi.persisting.subclasses.api.dto.PostingDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PostingController {

    @PostMapping("/posting")
    @ResponseStatus(value = HttpStatus.OK)
    public PostingDto postPosting(@RequestBody PostingDto posting) {
        System.out.println("CarPosting? :" + (posting instanceof CarPostingDto));
        System.out.println("MotorCyclePosting? :" + (posting instanceof MotorCyclePostingDto));
        return posting;
    }
}
