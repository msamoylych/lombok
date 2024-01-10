// version 21:

import java.util.SequencedSet;

import lombok.Builder;
import lombok.Singular;

@Builder
class BuilderSingularSequencedSet<T> {
    @Singular private SequencedSet<T> sequencedSet;
}