package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.Crown: VectorAsset
    get() {
        if (_crown != null) {
            return _crown!!
        }
        _crown = VectorAssetBuilder(name = "Crown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                lineToRelative(4.0f, 6.0f)
                lineToRelative(5.0f, -4.0f)
                lineToRelative(-2.0f, 10.0f)
                horizontalLineToRelative(-14.0f)
                lineToRelative(-2.0f, -10.0f)
                lineToRelative(5.0f, 4.0f)
                close()
            }
        }
        .build()
        return _crown!!
    }

private var _crown: VectorAsset? = null