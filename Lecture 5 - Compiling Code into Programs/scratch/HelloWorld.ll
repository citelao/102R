; ModuleID = 'HelloWorld.c'
target datalayout = "e-m:o-i64:64-f80:128-n8:16:32:64-S128"
target triple = "x86_64-apple-macosx10.10.0"

@.str = private unnamed_addr constant [6 x i8] c"test\0A\00", align 1

; Function Attrs: nounwind ssp uwtable
define i32 @main(i32 %a, i8** %b) #0 {
  %1 = alloca i32, align 4
  %2 = alloca i8**, align 8
  store i32 %a, i32* %1, align 4
  store i8** %b, i8*** %2, align 8
  call void @foo()
  ret i32 0
}

; Function Attrs: nounwind ssp uwtable
define void @foo() #0 {
  %1 = call i32 (i8*, ...)* @printf(i8* getelementptr inbounds ([6 x i8]* @.str, i32 0, i32 0))
  ret void
}

declare i32 @printf(i8*, ...) #1

attributes #0 = { nounwind ssp uwtable "less-precise-fpmad"="false" "no-frame-pointer-elim"="true" "no-frame-pointer-elim-non-leaf" "no-infs-fp-math"="false" "no-nans-fp-math"="false" "stack-protector-buffer-size"="8" "unsafe-fp-math"="false" "use-soft-float"="false" }
attributes #1 = { "less-precise-fpmad"="false" "no-frame-pointer-elim"="true" "no-frame-pointer-elim-non-leaf" "no-infs-fp-math"="false" "no-nans-fp-math"="false" "stack-protector-buffer-size"="8" "unsafe-fp-math"="false" "use-soft-float"="false" }

!llvm.ident = !{!0}

!0 = metadata !{metadata !"Apple LLVM version 6.0 (clang-600.0.57) (based on LLVM 3.5svn)"}
