package com.tuan.Controller;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class CustomeLoader implements ResourceLoaderAware{
	private ResourceLoader loader;
	public void setResourceLoader(ResourceLoader arg0) {
		loader = arg0;
	}
	public Resource getLoader(String duongdan) {
		return loader.getResource(duongdan);
	}
	public void setLoader(ResourceLoader loader) {
		this.loader = loader;
	}

}
