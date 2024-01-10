package ma.budget.gestionBudget.controllers;


import ma.budget.gestionBudget.models.requests.ExpenseCategoryRequest;
import ma.budget.gestionBudget.models.responses.ExpenseCategoryResponse;
import ma.budget.gestionBudget.services.ExpenseCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/expenseCategory")
public class ExpenseCategoryController {

    @Autowired
    ExpenseCategoryService expenseCategoryService;

    @PostMapping
    public ResponseEntity<ExpenseCategoryResponse> add(@RequestBody ExpenseCategoryRequest expenseCategoryRequest){
        ExpenseCategoryResponse expenseCategoryResponse = expenseCategoryService.addExpenseCategory(expenseCategoryRequest);
        return new ResponseEntity<ExpenseCategoryResponse>(expenseCategoryResponse, HttpStatus.CREATED);
    }


    @GetMapping
    public ResponseEntity<List<ExpenseCategoryResponse>> getall() {
        return new ResponseEntity<List<ExpenseCategoryResponse>>(expenseCategoryService.getAll(), HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<ExpenseCategoryResponse> getById(@PathVariable Long id) {
        return new ResponseEntity<ExpenseCategoryResponse>(expenseCategoryService.getExpenseCategory(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id) {
        expenseCategoryService.deleteExpenseCategory(id);
        return new ResponseEntity<String>("deleted !", HttpStatus.OK);
    }


    @PutMapping("/{id}")
    public ResponseEntity<ExpenseCategoryResponse> update( @RequestBody  ExpenseCategoryRequest expenseCategoryRequest , @PathVariable("id") Long id)
             {
        return new ResponseEntity<ExpenseCategoryResponse>(expenseCategoryService.updateExpenseCategory(expenseCategoryRequest,id), HttpStatus.OK);
    }












}
