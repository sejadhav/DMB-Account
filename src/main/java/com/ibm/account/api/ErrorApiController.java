package com.ibm.account.api;

import com.ibm.account.model.ModelAndView;
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
import com.ibm.account.services.ErrorHtmlUsingGETI;
import com.ibm.account.model.ErrorHtmlUsingGETP;
import com.ibm.account.model.ErrorHtmlUsingGETResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.ibm.account.services.ErrorHtmlUsingPUTI;
import com.ibm.account.model.ErrorHtmlUsingPUTP;
import com.ibm.account.model.ErrorHtmlUsingPUTResponseWrapper;
import com.ibm.account.services.ErrorHtmlUsingPOSTI;
import com.ibm.account.model.ErrorHtmlUsingPOSTP;
import com.ibm.account.model.ErrorHtmlUsingPOSTResponseWrapper;
import com.ibm.account.services.ErrorHtmlUsingDELETEI;
import com.ibm.account.model.ErrorHtmlUsingDELETEP;
import com.ibm.account.model.ErrorHtmlUsingDELETEResponseWrapper;
import com.ibm.account.services.ErrorHtmlUsingPATCHI;
import com.ibm.account.model.ErrorHtmlUsingPATCHP;
import com.ibm.account.model.ErrorHtmlUsingPATCHResponseWrapper;
import com.ibm.account.services.ErrorHtmlUsingHEADI;
import com.ibm.account.model.ErrorHtmlUsingHEADP;
import com.ibm.account.model.ErrorHtmlUsingHEADResponseWrapper;
import com.ibm.account.services.ErrorHtmlUsingOPTIONSI;
import com.ibm.account.model.ErrorHtmlUsingOPTIONSP;
import com.ibm.account.model.ErrorHtmlUsingOPTIONSResponseWrapper;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-16T11:09:28.190Z[GMT]")

@RestController
public class ErrorApiController implements ErrorApi {

	@Autowired
	ErrorHtmlUsingOPTIONSI errorHtmlUsingOPTIONSI;


	@Autowired
	ErrorHtmlUsingHEADI errorHtmlUsingHEADI;


	@Autowired
	ErrorHtmlUsingPATCHI errorHtmlUsingPATCHI;


	@Autowired
	ErrorHtmlUsingDELETEI errorHtmlUsingDELETEI;


	@Autowired
	ErrorHtmlUsingPOSTI errorHtmlUsingPOSTI;


	@Autowired
	ErrorHtmlUsingPUTI errorHtmlUsingPUTI;


	@Autowired
	ErrorHtmlUsingGETI errorHtmlUsingGETI;


    public ResponseEntity<ModelAndView> errorHtmlUsingDELETE(){
        
        ErrorHtmlUsingDELETEResponseWrapper res  = errorHtmlUsingDELETEI.execute(new ErrorHtmlUsingDELETEP());

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<ModelAndView> errorHtmlUsingGET(){
        
        ErrorHtmlUsingGETResponseWrapper res  = errorHtmlUsingGETI.execute(new ErrorHtmlUsingGETP());

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<ModelAndView> errorHtmlUsingHEAD(){
        
        ErrorHtmlUsingHEADResponseWrapper res  = errorHtmlUsingHEADI.execute(new ErrorHtmlUsingHEADP());

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<ModelAndView> errorHtmlUsingOPTIONS(){
        
        ErrorHtmlUsingOPTIONSResponseWrapper res  = errorHtmlUsingOPTIONSI.execute(new ErrorHtmlUsingOPTIONSP());

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<ModelAndView> errorHtmlUsingPATCH(){
        
        ErrorHtmlUsingPATCHResponseWrapper res  = errorHtmlUsingPATCHI.execute(new ErrorHtmlUsingPATCHP());

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<ModelAndView> errorHtmlUsingPOST(){
        
        ErrorHtmlUsingPOSTResponseWrapper res  = errorHtmlUsingPOSTI.execute(new ErrorHtmlUsingPOSTP());

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<ModelAndView> errorHtmlUsingPUT(){
        
        ErrorHtmlUsingPUTResponseWrapper res  = errorHtmlUsingPUTI.execute(new ErrorHtmlUsingPUTP());

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

}
