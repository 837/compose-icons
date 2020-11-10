package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Powershell: VectorAsset
    get() {
        if (_powershell != null) {
            return _powershell!!
        }
        _powershell = VectorAssetBuilder(name = "Powershell", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.181f, 3.077f)
                curveToRelative(0.568f, 0.0f, 0.923f, 0.463f, 0.792f, 1.035f)
                lineToRelative(-3.659f, 15.981f)
                curveToRelative(-0.13f, 0.572f, -0.697f, 1.035f, -1.265f, 1.035f)
                lineTo(0.819f, 21.128f)
                curveToRelative(-0.568f, 0.0f, -0.923f, -0.463f, -0.792f, -1.035f)
                lineTo(3.686f, 4.112f)
                curveToRelative(0.13f, -0.572f, 0.697f, -1.035f, 1.265f, -1.035f)
                horizontalLineToRelative(18.23f)
                close()
                moveTo(14.806f, 12.422f)
                curveToRelative(0.251f, -0.394f, 0.227f, -0.905f, -0.09f, -1.243f)
                lineTo(9.122f, 5.228f)
                curveToRelative(-0.38f, -0.405f, -1.037f, -0.407f, -1.466f, -0.004f)
                curveToRelative(-0.429f, 0.403f, -0.468f, 1.057f, -0.088f, 1.461f)
                lineToRelative(4.662f, 4.96f)
                verticalLineToRelative(0.11f)
                lineToRelative(-7.42f, 5.373f)
                curveToRelative(-0.45f, 0.327f, -0.533f, 0.977f, -0.187f, 1.453f)
                curveToRelative(0.346f, 0.476f, 0.991f, 0.597f, 1.44f, 0.27f)
                lineToRelative(8.229f, -5.909f)
                curveToRelative(0.28f, -0.197f, 0.438f, -0.366f, 0.514f, -0.52f)
                close()
                moveTo(12.01f, 16.821f)
                arcToRelative(0.928f, 0.928f, 0.0f, false, false, -0.934f, 0.923f)
                curveToRelative(0.0f, 0.51f, 0.418f, 0.923f, 0.934f, 0.923f)
                horizontalLineToRelative(4.433f)
                arcToRelative(0.928f, 0.928f, 0.0f, false, false, 0.934f, -0.923f)
                arcToRelative(0.928f, 0.928f, 0.0f, false, false, -0.934f, -0.923f)
                lineTo(12.01f, 16.821f)
                close()
            }
        }
        .build()
        return _powershell!!
    }

private var _powershell: VectorAsset? = null