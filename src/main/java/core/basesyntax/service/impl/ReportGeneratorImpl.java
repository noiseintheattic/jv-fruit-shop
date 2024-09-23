package core.basesyntax.service.impl;

import core.basesyntax.db.Storage;
import core.basesyntax.model.Fruit;
import core.basesyntax.service.ReportGenerator;

public class ReportGeneratorImpl implements ReportGenerator {
    @Override
    public String getReport() {
        StringBuilder builder = new StringBuilder();
        builder.append("fruit,quantity")
                .append(System.lineSeparator());
        for (Fruit name: Storage.keyset()) {
            Integer value = Storage.getQuantity(name);
            builder.append(name)
                    .append(",")
                    .append(value)
                    .append(System.lineSeparator());
        }
        return builder.toString();
    }
}
