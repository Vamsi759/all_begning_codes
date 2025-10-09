
/*
_-------------


Department dept = new Department();
dept.setName("HR");

Employee e1 = new Employee();
e1.setName("Alice");
e1.setDepartment(dept);

Employee e2 = new Employee();
e2.setName("Bob");
e2.setDepartment(dept);

dept.setEmployees(Arrays.asList(e1, e2));

EntityTransaction tx = manager.getTransaction();
tx.begin();
manager.persist(dept);   // Only saving Department
tx.commit();
---  - i iiiiiiiii



💡 5. What Happens Behind the Scenes
Because of cascade = CascadeType.ALL:

Hibernate automatically saves both Employees when you persist the Department.

You don’t need to call manager.persist(e1) or manager.persist(e2).

If you later delete the Department, Hibernate will also delete all related Employees.


--------------

⚠️ 6. Without CascadeType.ALL
If you remove cascade = CascadeType.ALL, then you must manually persist each child:

java
Copy code
manager.persist(dept);
manager.persist(e1);
manager.persist(e2);
Otherwise, Hibernate throws an exception:

org.hibernate.TransientObjectException: object references an unsaved transient instance

🧠 7. Summary

---------------
*/
