package io.quarkus.extension.repository;

import java.util.List;

import io.quarkus.extension.repository.model.QuarkusPlatformStream;

public interface ListPlatformStreamsRequest {

	List<QuarkusPlatformStream> getPlatformSummary();
}
