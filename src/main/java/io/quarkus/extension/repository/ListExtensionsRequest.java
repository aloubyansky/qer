package io.quarkus.extension.repository;

import java.util.List;

import io.quarkus.extension.repository.model.QuarkusExtensionCategory;
import io.quarkus.extension.repository.model.QuarkusExtensionSummary;
import io.quarkus.extension.repository.model.QuarkusPlatform;

public interface ListExtensionsRequest {

	List<QuarkusExtensionCategory> getCategories();

	List<QuarkusExtensionSummary> getExtensionSummaries();

	QuarkusPlatform getPlatform();
}
