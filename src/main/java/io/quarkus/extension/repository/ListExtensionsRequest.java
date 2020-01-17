package io.quarkus.extension.repository;

import io.quarkus.extension.repository.model.QuarkusExtensionCategory;
import io.quarkus.extension.repository.model.QuarkusExtensionSummary;
import io.quarkus.extension.repository.model.QuarkusPlatform;

public interface ListExtensionsRequest {

	QuarkusExtensionCategory getCategory();

	QuarkusExtensionSummary getSummary();

	QuarkusPlatform getPlatform();
}
