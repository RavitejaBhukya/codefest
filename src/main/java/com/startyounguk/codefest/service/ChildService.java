package com.startyounguk.codefest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.startyounguk.codefest.model.Child;
import com.startyounguk.codefest.repository.ChildRepository;

@Service
public class ChildService {

    @Autowired
    ChildRepository childRepository;

    public List<Child> getAllChildren(){
        Sort sortUsingName = Sort.by(Sort.Direction.ASC, "name");
        return childRepository.findAll(sortUsingName);
    }

    public Page<Child> searchInNameContainsText(String text, Integer pageNumber, Integer pageSize){
        Child child = new Child();
        child.setName(text);

        ExampleMatcher caseInsensitiveMatcher = ExampleMatcher.matchingAny()
            .withMatcher("name", ExampleMatcher.GenericPropertyMatchers.contains().ignoreCase());
        Example<Child> example = Example.of(child, caseInsensitiveMatcher);
        PageRequest pageRequest = PageRequest.of(pageNumber, pageSize);
        return childRepository.findAll(example, pageRequest);
    }
}
