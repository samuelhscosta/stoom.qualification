package br.com.stoom.qualification;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.MediaType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.stoom.qualification.model.Adress;
import br.com.stoom.qualification.AdressRepository;

import java.util.List;
import java.util.Optional;
import javax.validation.Valid;


@RestController
public class AdressController {
	
	@Autowired
    private AdressRepository _adressRepository;
	
	/*@RequestMapping(value="/full-adress", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Adress getFullAdress() {
		var adress = new Adress();
		adress.setStreetName("Samuel");
		adress.setNumber("Costa");
		adress.setStreetName("Rua Manoel Ângelo da Silva");
		adress.setNumber("616");
		adress.setComplement("");
		adress.setNeighbourhood("Beira Rio");
		adress.setCity("Guaratinguetá");
		adress.setState("São Paulo");
		adress.setCountry("Brasil");
		adress.setZipcode("12517610");
		adress.setLatitude("");
		adress.setLongitude("");
		return adress;
	}*/
	
	@RequestMapping(value = "/adress", method = RequestMethod.GET)
    public List<Adress> Get() {
        return _adressRepository.findAll();
    }
	
	@RequestMapping(value = "/adress/{id}", method = RequestMethod.GET)
    public ResponseEntity<Adress> GetById(@PathVariable(value = "id") long id)
    {
        Optional<Adress> adress = _adressRepository.findById(id);
        if(adress.isPresent()) {
            return new ResponseEntity<Adress>(adress.get(), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
	
	@RequestMapping(value = "/adress", method =  RequestMethod.POST)
    public Adress Post(@Valid @RequestBody Adress adress)
    {
        return _adressRepository.save(adress);
    }
	
	@RequestMapping(value = "/adress/{id}", method =  RequestMethod.PUT)
    public ResponseEntity<Adress> Put(@PathVariable(value = "id") long id, @Valid @RequestBody Adress newAdress)
    {
        Optional<Adress> oldAdress = _adressRepository.findById(id);
        if(oldAdress.isPresent()){
            Adress adress = oldAdress.get();
            adress.setId(newAdress.getId());
            adress.setStreetName(newAdress.getStreetName());
            adress.setNumber(newAdress.getNumber());
            adress.setComplement(newAdress.getComplement());
            adress.setNeighbourhood(newAdress.getNeighbourhood());
            adress.setCity(newAdress.getCity());
            adress.setState(newAdress.getState());
            adress.setCountry(newAdress.getCountry());
            adress.setZipcode(newAdress.getZipcode());
            adress.setLatitude(newAdress.getLatitude());
            adress.setLongitude(newAdress.getLongitude());
            _adressRepository.save(adress);
            return new ResponseEntity<Adress>(adress, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
	
	@RequestMapping(value = "/adress/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> Delete(@PathVariable(value = "id") long id)
    {
        Optional<Adress> adress = _adressRepository.findById(id);
        if(adress.isPresent()){
            _adressRepository.delete(adress.get());
            return new ResponseEntity<>(HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
	
}
