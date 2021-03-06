package org.jasig.cas.support.events.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.stream.Collectors;

/**
 * This is {@link AbstractCasEventRepository}.
 *
 * @author Misagh Moayyed
 * @since 4.3.0
 */
public abstract class AbstractCasEventRepository implements CasEventRepository {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public Collection<CasEvent> getEventsOfType(final String type) {
        final Collection<CasEvent> events = load();
        return events.stream().filter(event -> event.getType().equals(type)).collect(Collectors.toSet());
    }

}
