package com.dev.sunny.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Getter
@Setter
@ToString
public class Author {

    int id;
    String name;
    String email;
    List<String> publications;

}
