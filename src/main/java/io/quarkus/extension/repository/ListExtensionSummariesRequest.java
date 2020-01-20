package io.quarkus.extension.repository;

import java.util.List;

import io.quarkus.extension.repository.model.QuarkusExtensionCategory;
import io.quarkus.extension.repository.model.QuarkusPlatformStream;

public interface ListExtensionSummariesRequest {

	List<QuarkusExtensionCategory> getCategories();

	QuarkusPlatformStream getPlatformStream();
}
