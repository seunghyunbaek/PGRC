package best.hyun.pgrc.type.ogaros

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber


class Norgon : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_norgon)
    override val type: PET_TYPE
        get() = PET_TYPE.OGAROS
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_norgon)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WIND
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.FIRE
    override val mainElementalValue: Int
        get() = 90
    override val subElementalValue: Int
        get() = 10
    override val initLv: Int
        get() = 1
    override val initLvMaxHp: Int
        get() = 71
    override val initLvMaxAtk: Int
        get() = 17
    override val initLvMaxDef: Int
        get() = 10
    override val initLvMaxSpd: Int
        get() = 11
    override val maxLv: Int
        get() = 140
    override val maxLvMaxHp: Int
        get() = 1572
    override val maxLvMaxAtk: Int
        get() = 385
    override val maxLvMaxDef: Int
        get() = 236
    override val maxLvMaxSpd: Int
        get() = 246
    override val initLvMinHp: Int
        get() = 56
    override val initLvMinAtk: Int
        get() = 14
    override val initLvMinDef: Int
        get() = 8
    override val initLvMinSpd: Int
        get() = 9
    override val maxLvMinHp: Int
        get() = 1361
    override val maxLvMinAtk: Int
        get() = 346
    override val maxLvMinDef: Int
        get() = 197
    override val maxLvMinSpd: Int
        get() = 214
    override val minAllGrowth: Double
        get() = 5.263
    override val maxAllGrowth: Double
        get() = 5.970
}