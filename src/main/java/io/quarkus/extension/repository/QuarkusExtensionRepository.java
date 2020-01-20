package io.quarkus.extension.repository;

import java.util.List;

import io.quarkus.extension.repository.model.QuarkusExtension;
import io.quarkus.extension.repository.model.QuarkusExtensionCategory;
import io.quarkus.extension.repository.model.QuarkusExtensionSummary;
import io.quarkus.extension.repository.model.QuarkusPlatform;
import io.quarkus.extension.repository.model.QuarkusPlatformStream;
import io.quarkus.extension.repository.model.QuarkusPlatformSummary;

/**
 * Provides means to list and search for registered extensions.
 */
public interface QuarkusExtensionRepository {

	List<QuarkusExtensionCategory> listExtensionCategories(ListExtensionCategoriesRequest request);

	List<QuarkusExtensionSummary> listExtensionSummaries(ListExtensionSummariesRequest request);

	List<QuarkusExtension> listExtensions(ListExtensionsRequest request);

	List<QuarkusPlatformSummary> listPlatformSummaries(ListPlatformSummariesRequest request);

	List<QuarkusPlatformStream> listPlatformStreams(ListPlatformStreamsRequest request);

	List<QuarkusPlatform> listPlatforms(ListPlatformsRequest request);

}
