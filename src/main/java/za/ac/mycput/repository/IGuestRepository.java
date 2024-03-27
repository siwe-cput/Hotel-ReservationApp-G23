package za.ac.mycput.repository;

import za.ac.mycput.domain.Guest;

import java.util.List;

public interface IGuestRepository extends IRepository<Guest, String>{
    List<Guest> getall();

    Guest update(String Name);
}

