package io.quarkus.extension.repository;

import java.util.List;

import io.quarkus.extension.repository.model.QuarkusPlatform;
import io.quarkus.extension.repository.model.QuarkusPlatformStream;

public interface ListPlatformsRequest {

	List<QuarkusPlatform> getPlatformStream(QuarkusPlatformStream stream);

	boolean isLatest();

	// Quarkus version?
}
