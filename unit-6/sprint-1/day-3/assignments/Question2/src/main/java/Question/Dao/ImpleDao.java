package Question.Dao;

import Question.Employee;

public interface ImpleDao {
    public void save(Employee emp);
    public String getAddressOfEmployee(int empId);
    public String giveBonusToEmployee(int empId, int bonus);
    public boolean deleteEmployee(int empId);
}
