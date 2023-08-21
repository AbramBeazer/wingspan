package org.example.models.bonuscard;

import org.example.models.Preserve;

public abstract class BonusCard {
    protected String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public abstract int evaluate(Preserve preserve);
}
