package com.msa4spring.requests;

public record UsersPaginationRequest(
        int page
        ,int limit
) {
    //public UsersPaginationRequest(String page, String limit) {
      //  this.page = (page == null || page.isBlank()) ? "1" : page;
        //this.limit = (page == null || limit.isBlank()) ? "10" : limit;
}
