package com.bootcamp.PytoS1_BcoAccount.model;

import lombok.*;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Scope(scopeName = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Account {
    @Id
    private int id;
    private String numberAccount;
    private String type;
}
