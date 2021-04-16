package com.ibm.account.api;

import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import com.ibm.account.services.GetMessageUsingGETI;
import com.ibm.account.model.GetMessageUsingGETP;
import com.ibm.account.model.GetMessageUsingGETResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-16T11:09:28.190Z[GMT]")

@RestController
public class MessageApiController implements MessageApi {

	@Autowired
	GetMessageUsingGETI getMessageUsingGETI;


    public ResponseEntity<String> getMessageUsingGET(){
        
        GetMessageUsingGETResponseWrapper res  = getMessageUsingGETI.execute(new GetMessageUsingGETP());

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

}
