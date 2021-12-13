package guru.springframework.msscbeerservice.controller;

import guru.springframework.msscbeerservice.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * Created by michael on 2021-12-10.
 */
@RestController
@RequestMapping("api/v1/beer")
public class BeerController {

    @GetMapping(value = "/id/{beerId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BeerDto> getBeerById(@PathVariable UUID beerId) {
        //todo impl
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @GetMapping(value = "/upc/{beerUpc}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BeerDto> getBeerByUpc(@PathVariable String beerUpc) {
        //todo impl
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity saveNewBeer(@RequestBody BeerDto newBeer) {
        //todo impl
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping(value = "/{beerId}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updateBeerById(@PathVariable UUID beerId, @RequestBody BeerDto beer) {
        //todo impl
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
