package io.quarkus.extension.repository;

import io.quarkus.extension.repository.model.QuarkusExtensionCategory;
import io.quarkus.extension.repository.model.QuarkusPlatform;

public interface ListExtensionSummariesRequest {

	QuarkusExtensionCategory getCategory();

	QuarkusPlatform getPlatform();
}
