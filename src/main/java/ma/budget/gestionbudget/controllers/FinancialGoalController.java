package ma.budget.gestionbudget.controllers;


import ma.budget.gestionbudget.models.requests.FinancialGoalRequest;
import ma.budget.gestionbudget.models.responses.FinancialGoalResponse;
import ma.budget.gestionbudget.services.FinancialGoalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/financialGoal")
public class FinancialGoalController {

    @Autowired
    FinancialGoalService financialGoalService;

    @PostMapping
    public ResponseEntity<FinancialGoalResponse> add(@RequestBody FinancialGoalRequest financialGoalRequest){
        FinancialGoalResponse financialGoalResponse = financialGoalService.addFinancialGoal(financialGoalRequest);
        return new ResponseEntity<FinancialGoalResponse>(financialGoalResponse, HttpStatus.CREATED);
    }


    @GetMapping
    public ResponseEntity<List<FinancialGoalResponse>> getall() {
        return new ResponseEntity<List<FinancialGoalResponse>>(financialGoalService.getAll(), HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<FinancialGoalResponse> getById(@PathVariable Long id) {
        return new ResponseEntity<FinancialGoalResponse>(financialGoalService.getFinancialGoal(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id) {
        financialGoalService.deleteFinancialGoal(id);
        return new ResponseEntity<String>("deleted !", HttpStatus.OK);
    }


    @PutMapping("/{id}")
    public ResponseEntity<FinancialGoalResponse> update( @RequestBody  FinancialGoalRequest financialGoalRequest , @PathVariable("id") Long id)
             {
        return new ResponseEntity<FinancialGoalResponse>(financialGoalService.updateFinancialGoal(financialGoalRequest,id), HttpStatus.OK);
    }












}
