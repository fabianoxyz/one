package xyz.fabiano.one;

import xyz.fabiano.one.dsl.Builder;
import xyz.fabiano.one.dsl.Configuration;
import xyz.fabiano.one.dsl.Workflow;

public class ExampleWorkflow implements Workflow {
    @Override
    public Configuration setup(Builder b) {
        return b
                .extract("extract people from postgres", c -> c.getConnection("postgres_conn"), "SELECT * FROM {{schema}}.TBL_PEOPLE")
                .transform("uppercase people name", c -> c.get("people").map(person -> person.put("name", person.get("name").toUpperCase())))
                .load("save to postgres again", c -> c.getConnection("postgres_conn"), "{{schema}}.TBL_PEOPLE")
                .build();
    }
}
