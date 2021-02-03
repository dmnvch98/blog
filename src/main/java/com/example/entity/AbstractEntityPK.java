package com.example.entity;

import com.example.model.AbstractModel;

import java.io.Serializable;
import java.util.Objects;

public class AbstractEntityPK<PK> extends AbstractModel implements Serializable {
    private static final long serialVersionUID = -8207076274397615397L;
    private PK id;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public PK getId() {
        return id;
    }

    public void setId(PK id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractEntityPK<?> that = (AbstractEntityPK<?>) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
