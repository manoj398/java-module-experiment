module org.provider {
    requires org.api;
    provides org.api.API with org.provider.Provider;
}