package ma.budget.gestionbudget.controllers;


import ma.budget.gestionbudget.models.requests.ExpenseRequest;
import ma.budget.gestionbudget.models.responses.ExpenseResponse;
import ma.budget.gestionbudget.services.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/expense")
public class ExpenseController {

    @Autowired
    ExpenseService expenseService;

    @PostMapping
    public ResponseEntity<ExpenseResponse> add(@RequestBody ExpenseRequest expenseRequest){
        ExpenseResponse expenseResponse = expenseService.addExpense(expenseRequest);
        return new ResponseEntity<ExpenseResponse>(expenseResponse, HttpStatus.CREATED);
    }


    @GetMapping
    public ResponseEntity<List<ExpenseResponse>> getall() {
        return new ResponseEntity<List<ExpenseResponse>>(expenseService.getAll(), HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<ExpenseResponse> getById(@PathVariable Long id) {
        return new ResponseEntity<ExpenseResponse>(expenseService.getExpense(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id) {
        expenseService.deleteExpense(id);
        return new ResponseEntity<String>("deleted !", HttpStatus.OK);
    }


    @PutMapping("/{id}")
    public ResponseEntity<ExpenseResponse> update( @RequestBody  ExpenseRequest expenseRequest , @PathVariable("id") Long id)
             {
        return new ResponseEntity<ExpenseResponse>(expenseService.updateExpense(expenseRequest,id), HttpStatus.OK);
    }












}
