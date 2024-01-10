package ma.budget.gestionBudget.mappers;

public interface IMapper<T, REQ, RES> {
    
    T requestToObject(REQ req);

    RES objectToResponse(T object);

}
