package com.tiraj.jobschedular.dao;

import com.tiraj.jobschedular.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository  extends JpaRepository<Task,Integer> {


}
