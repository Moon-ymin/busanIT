package com.busanit.ch04_permission

import android.Manifest
import android.os.Bundle
import android.util.Log
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.busanit.ch04_permission.databinding.ActivityPermissoin2Binding

class Permission2Activity : AppCompatActivity() {

    // 권한 목록
    val permissionList = arrayOf(
        Manifest.permission.INTERNET,
        Manifest.permission.READ_CONTACTS,
        Manifest.permission.WRITE_CONTACTS,
        Manifest.permission.ACCESS_FINE_LOCATION,
        Manifest.permission.ACCESS_COARSE_LOCATION,
        Manifest.permission.READ_EXTERNAL_STORAGE,
        Manifest.permission.WRITE_EXTERNAL_STORAGE
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityPermissoin2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // 위치 권한 요청 객체 생성과 콜백 설정
        val request1 = ActivityResultContracts.RequestMultiplePermissions()
        val locationLauncher = registerForActivityResult(request1) {
            for ((permission, granted) in it) {
                when (permission) {
                    Manifest.permission.ACCESS_FINE_LOCATION -> {
                        if (granted) {
                            Log.d("mylog", "정밀 위치 권한 허용")
                        } else {
                            Log.d("mylog", "정밀 위치 권한 거부")
                        }
                    }

                    Manifest.permission.ACCESS_COARSE_LOCATION -> {
                        if (granted) {
                            Log.d("mylog", "개략 위치 권한 허용")
                        } else {
                            Log.d("mylog", "개략 위치 권한 거부")
                        }
                    }


                }
            }
        }

        // 연락처 권한 요청 객체 생성과 콜백 설정
        val request2 = ActivityResultContracts.RequestMultiplePermissions()
        val contactLauncher = registerForActivityResult(request2) {
            for ((permission, granted) in it) {
                when (permission) {
                    Manifest.permission.READ_CONTACTS -> {
                        if (granted) {
                            Log.d("mylog", "연락처 읽기 권한 허용")
                        } else {
                            Log.d("mylog", "연락처 읽기 권한 거부")
                        }
                    }

                    Manifest.permission.WRITE_CONTACTS -> {
                        if (granted) {
                            Log.d("mylog", "연락처 쓰기 권한 허용")
                        } else {
                            Log.d("mylog", "연락처 쓰기 권한 거부")
                        }
                    }


                }
            }
        }

        // 저장소 권한 요청 객체 생성과 콜백 설정
        val request3 = ActivityResultContracts.RequestMultiplePermissions()
        val storageLauncher = registerForActivityResult(request3) {
            for ((permission, granted) in it) {
                when (permission) {
                    Manifest.permission.READ_EXTERNAL_STORAGE -> {
                        if (granted) {
                            Log.d("mylog", "외부 저장소 읽기 권한 허용")
                        } else {
                            Log.d("mylog", "외부 저장소 읽기 권한 거부")
                        }
                    }

                    Manifest.permission.WRITE_EXTERNAL_STORAGE -> {
                        if (granted) {
                            Log.d("mylog", "외부 저장소 쓰기 권한 허용")
                        } else {
                            Log.d("mylog", "외부 저장소 쓰기 권한 거부")
                        }
                    }
                }
            }
        }

        binding.button1.setOnClickListener {
            // 권환 확인을 요청합니다. (모든 권한)
            requestPermissions(permissionList, 0)   // 권한 목록, 요청코드
        }

        binding.button2.setOnClickListener {
            // 위치 관련 권한
            locationLauncher.launch(arrayOf(
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.ACCESS_COARSE_LOCATION
            ))
        }

        binding.button3.setOnClickListener {
            // 연락처 관련 권한
            contactLauncher.launch(
                arrayOf(
                    Manifest.permission.READ_CONTACTS,
                    Manifest.permission.WRITE_CONTACTS,
                )
            )
        }

        binding.button4.setOnClickListener {
            // 저장소 관련 권한
            storageLauncher.launch(
                arrayOf(
                    Manifest.permission.READ_EXTERNAL_STORAGE,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE
                )
            )
        }
    }

    // 권한 요청 결과 처리하는 메서드
    // 권한 요청 작업이 끝나면 자동으로 호출되는 메서드
    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,     // 권한 이름 문자열 배열
        grantResults: IntArray              // 허용 여부 값
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        // 전체 권한의 크기만큼 순회하면서
        for (idx in 0 until permissions.size) {
            // 권한의 이름
            val permission = permissions[idx]
            // 권한 허용 여부
            val grantedResult = grantResults[idx]

            Log.d("mylog", "$permission : $grantedResult ")
        }
    }
}