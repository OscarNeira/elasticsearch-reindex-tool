package pl.allegro.tech.search.elasticsearch.tools.reindex.query;

import pl.allegro.tech.search.elasticsearch.tools.reindex.connection.ElasticSearchQuery;

import java.util.Optional;

public final class EmptySegmentation extends SegmentationQueryTrait implements QuerySegmentation {

  private EmptySegmentation(ElasticSearchQuery query) {
    super(query);
  }

  @Override
  public Optional<String> getFieldName() {
    return Optional.empty();
  }

  @Override
  public int getSegmentsCount() {
    return 1;
  }

  @Override
  public Optional<BoundedSegment> getThreshold(int i) {
    return Optional.empty();
  }

  public static EmptySegmentation createEmptySegmentation(ElasticSearchQuery query) {
    return new EmptySegmentation(query);
  }

}
