package org.acme.opentelemetry;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeTracedResourceIT extends TracedResourceTest {

    // Execute the same tests but in native mode.
}