package com.yann.em.server.impl;

import com.yann.em.grpc.UserInfo.UserInfo;
import com.yann.em.grpc.UserInfo.UserInfoReq;
import com.yann.em.grpc.UserInfo.UserInfoResponse;
import com.yann.em.grpc.UserInfo.UserInfoServiceGrpc;
import net.devh.boot.grpc.server.service.GrpcService;


@GrpcService
public class UserInfoServiceGrpcImpl extends UserInfoServiceGrpc.UserInfoServiceImplBase {


    @Override
    public void queryUserInfo(UserInfoReq request, io.grpc.stub.StreamObserver<UserInfoResponse> responseObserver) {
        UserInfoResponse.Builder userInfoResp = UserInfoResponse.newBuilder();
        userInfoResp.setCode(0).setMsg("success").setSuccess(true);
        UserInfo.Builder userInfo = UserInfo.newBuilder();
        userInfo.setId(request.getId());
        userInfo.setName(request.getName());

        userInfoResp.setData(UserInfoResponse.Data.newBuilder().setUserInfo(userInfo));
        responseObserver.onNext(userInfoResp.build());
        responseObserver.onCompleted();

    }


}
